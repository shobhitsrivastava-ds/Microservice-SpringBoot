package com.contact.usercontacts.service;

import com.contact.usercontacts.entity.Contract;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contract> list= List.of(new Contract(1L, "fgsfgs@gmail.com", "5452352323", 1311L),
                    new Contract(1L, "rohan@gmail.com", "5452352323", 1312L),
                    new Contract(2L, "anil@gmail.com", "5452352323", 1311L),
                    new Contract(3L, "shobhit@gmail.com", "5452352323", 1313L),
                    new Contract(2L, "sam@gmail.com", "5452352323", 1311L));

    @Override
    public List<Contract> getContacts(Long userId) {
        return list.stream().filter(contract -> contract.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
