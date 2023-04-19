package com.springboot.MMS.Service;

import java.util.List;

import com.springboot.MMS.Entity.BillItems;

public interface BillItemsService 
{
	BillItems postBillItems(BillItems bi);
	List<BillItems> getAllBillItems();
	BillItems getBillItemsById(int id);
	BillItems updateBillItemsById(BillItems bi,int id);
	void deleteBillItemsById(int id);
}
