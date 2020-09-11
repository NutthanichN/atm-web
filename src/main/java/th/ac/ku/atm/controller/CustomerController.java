package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    private List<String> customers = new ArrayList<>();

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        customers.add("Peter");
        customers.add("Nancy");
        customers.add("Rick");

        model.addAttribute("allCustomers", customers);
        return "customer";
    }
}
