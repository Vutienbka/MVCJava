package DisplayCustomerList;

import java.util.ArrayList;
import java.util.List;

public class CustomerManage {
    List<Customer> customerList = new ArrayList<>();
    public void initializeCustomerList(){
        customerList.add(new Customer("Nguyen Van Hoang","20-2-2020","Ha Noi",
                "https://i.pinimg.com/originals/62/0a/f3/620af34fb92695fc74b81101432e2c8f.png"));
        customerList.add(new Customer("Nguyen Van Lanh","20-2-2020","Ha Noi",
                "https://i.pinimg.com/originals/62/0a/f3/620af34fb92695fc74b81101432e2c8f.png"));
        customerList.add(new Customer("Nguyen Van Binh","20-2-2020","Ha Noi",
                "https://i.pinimg.com/originals/62/0a/f3/620af34fb92695fc74b81101432e2c8f.png"));
        customerList.add(new Customer("Nguyen Van An","20-2-2020","Ha Noi",
                "https://i.pinimg.com/originals/62/0a/f3/620af34fb92695fc74b81101432e2c8f.png"));
        customerList.add(new Customer("Nguyen Van Manh","20-2-2020","Ha Noi",
                "https://i.pinimg.com/originals/62/0a/f3/620af34fb92695fc74b81101432e2c8f.png"));
    }
    public void display(){
        for(Customer customer: customerList){
            System.out.println(customer.getImage());
        }
    }

}
