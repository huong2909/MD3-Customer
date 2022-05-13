import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet", value = "/ListServlet")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Huong","29/09/1995","Ha Nam","https://upanh123.com/wp-content/uploads/2020/11/anh-tho-chibi.0.jpg");
        Customer customer1 = new Customer("Hue","29/09/1995","Thai Nguyen","https://toigingiuvedep.vn/wp-content/uploads/2021/07/hinh-ve-don-gian-sieu-cute-sieu-de-thuong-1.jpg");
        Customer customer2 = new Customer("Thuong","29/09/1995","Hai Duong","https://haycafe.vn/wp-content/uploads/2022/01/Hinh-anh-cute.jpg");
        Customer customer3 = new Customer("Manh","29/09/1995","Ha Nam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRz4X6TLbtd5nGULjm8MFpz_Cu08_ns05bl1Q&usqp=CAU");
        Customer customer4 = new Customer("Kiên","29/09/1995","Ha Noi","https://demoda.vn/wp-content/uploads/2022/01/anh-tra-sua-hoat-hinh.jpg");
        Customer customer5 = new Customer("Binh","29/09/1995","Hai Phong","https://i.pinimg.com/originals/b3/df/6c/b3df6c8581fde94d654f09be1669f09b.png");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        request.setAttribute("customer",customerList);
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
