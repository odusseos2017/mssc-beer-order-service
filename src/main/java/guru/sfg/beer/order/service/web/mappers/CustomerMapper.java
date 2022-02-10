package guru.sfg.beer.order.service.web.mappers;

import org.mapstruct.Mapper;

import guru.sfg.beer.order.service.domain.Customer;
import guru.sfg.beer.order.service.web.model.CustomerDto;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}