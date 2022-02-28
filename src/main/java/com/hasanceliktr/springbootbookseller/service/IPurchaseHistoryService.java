package com.hasanceliktr.springbootbookseller.service;

import java.util.List;

import com.hasanceliktr.springbootbookseller.model.PurchaseHistory;
import com.hasanceliktr.springbootbookseller.repository.projection.IPurchaseItem;

public interface IPurchaseHistoryService {

	PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);

}
