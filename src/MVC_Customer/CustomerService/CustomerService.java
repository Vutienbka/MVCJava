package MVC_Customer.CustomerService;

import MVC_Customer.Model.Customer;

import java.util.*;

public class CustomerService implements I_CustomerService{
    private static Map<Integer,Customer> customerMap;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1,new Customer(1,"Vu Hoang", "vuhoang@gmail.com","Ha Noi","20-02-2000",
                "https://image.shutterstock.com/image-photo/close-isolated-portrait-cheerful-happy-260nw-763024246.jpg"));
        customerMap.put(2,new Customer(2,"Nguyen Lanh", "lanhhanoi@gmail.com","Ha Noi","20-02-2000",
                "https://media.gettyimages.com/photos/portrait-of-smiling-young-man-wearing-eyeglasses-picture-id985138634?s=612x612"));
        customerMap.put(3,new Customer(3,"Vu Hoang Nam", "hoangnamhaiphong@gmail.com","Hai Phong","20-02-2000",
                "https://upload.wikimedia.org/wikipedia/commons/f/f5/Poster-sized_portrait_of_Barack_Obama.jpg"));
        customerMap.put(4,new Customer(4,"Nguyen Thi Tuyet", "nguyentuyet@gmail.com","Nam Dinh","20-02-2000",
                "https://images.pexels.com/photos/1130626/pexels-photo-1130626.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        customerMap.put(5,new Customer(5,"Vu Hoang Linh", "hoanglinh@gmail.com","Sai Gon","20-02-2000",
                "https://lifetouch.com/wp-content/uploads/2018/06/seniorTB.jpg"));
    }
    @Override
    public ArrayList<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int Id) {
        Iterator<Map.Entry<Integer,Customer>> entrySetKey = customerMap.entrySet().iterator();
        while(entrySetKey.hasNext()){
            Map.Entry<Integer, Customer> currentEntry = entrySetKey.next();
            if(currentEntry.getKey()==Id)return currentEntry.getValue();
        }
        return null;
    }

    @Override
    public void update(int Id, Customer customer) {
        Iterator<Map.Entry<Integer,Customer>> entrySetKey = customerMap.entrySet().iterator();
        while(entrySetKey.hasNext()){
            Map.Entry<Integer, Customer> currentEntry = entrySetKey.next();
            if(currentEntry.getKey()==Id) {
                currentEntry.setValue(customer);
            }
        }
    }

    @Override
    public void remove(int Id) {
        Iterator<Map.Entry<Integer,Customer>> entrySetKey = customerMap.entrySet().iterator();
        while(entrySetKey.hasNext()){
            Map.Entry<Integer, Customer> currentEntry = entrySetKey.next();
            if(currentEntry.getKey()==Id) {
                entrySetKey.remove();
            }
        }
    }
}
