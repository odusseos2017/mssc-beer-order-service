package guru.sfg.beer.order.service.services;

import org.springframework.data.domain.Pageable;

import guru.sfg.brewery.model.CustomerPagedList;

/**
 * Created by jt on 3/7/20.
 */
public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}