package com.backendassignment.demo.services;
import com.backendassignment.demo.dao.*;

import com.backendassignment.demo.entitites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShippingServiceClass implements ShippingService {
	
	@Autowired
	private ShippingDao shippingDao;
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private PurchaseDao2 purchaseDao;
	

	@Override
	public List<Customer_Purchase_Ship> getShipping() {
		    List<Customer_Purchase_Ship> list_new=new ArrayList<>();
			List<Customers> list=customerDao.findAll();
			for(Customers item:list)
			{
				long cid=item.getId();
				List<Purchase> purchase=purchaseDao.findBycid(cid);
				for(Purchase item1:purchase) {
					if(item1!=null)
					{
		                 long pid=item1.getId();
					
				List<Optional<Shipping>> shipping=shippingDao.findByPidAndCid(pid,cid);
				list_new.add(new Customer_Purchase_Ship(cid,item1,shipping));
					}
				}
			}
		
			return list_new;
			
		
	}
	@Override
	public List<Optional<Customers>> getShipping(String city) {
		List<Shipping> list=shippingDao.findBycity(city);
		List<Optional<Customers>> list_new=new ArrayList<>();
		
		for(Shipping item:list)
		{
			long id=item.getCid();
			Optional<Customers> customer=customerDao.findById(id);
			if(customer!=null)
			list_new.add(customer);
		}
		return list_new;
		
	}
	@Override
	public Shipping addShipping(Shipping shipping) {
	    shippingDao.save(shipping);
		return shipping;
	}

	
   
}
