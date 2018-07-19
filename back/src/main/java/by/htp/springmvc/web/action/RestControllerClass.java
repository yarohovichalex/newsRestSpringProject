package by.htp.springmvc.web.action;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import by.htp.springmvc.component.Car;
import by.htp.springmvc.component.NewArr;
import by.htp.springmvc.component.SimpleNew;

@RestController
@RequestMapping(value = "/cars")
public class RestControllerClass {
	public static ArrayList<Car> cars = new ArrayList<>();

	static {
		cars.add(new Car(1, "aaa", "aaaa"));
		cars.add(new Car(2, "bbb", "bbbb"));
	}

	// @Autowired
	// private CarService carService;
	//
	// public void setCarService(CarService carService) {
	// this.carService = carService;
	// }
	// ModelAndView

	@RequestMapping(method = RequestMethod.GET)
	public NewArr cars(ModelMap model) {
		System.out.println("in cars");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("carlist");
		modelAndView.addObject("mycarlist", cars);
		String string = "{articles: [{id: '1', image: 'http://via.placeholder.com/350x150', title: 'Article1', content: 'Lorem Ipsum is simply dummy'},{id: '2', image: 'http://via.placeholder.com/350x150', title: 'Article2', content: 'Lorem Ipsum is simply dummy'}]}";
		SimpleNew sn1 = new SimpleNew(1, "http://via.placeholder.com/350x150", "Title1", "Lorem Ipsum is simply dummy text");
		SimpleNew sn2 = new SimpleNew(2, "http://via.placeholder.com/350x150", "Title2", "Lorem Ipsum is simply dummy text");
		SimpleNew[] simpleNewArr = { sn1, sn2 };
		NewArr newArr = new NewArr(simpleNewArr);
		return newArr;
	}

	@RequestMapping(method = RequestMethod.POST)
	public HttpStatus addCar(@RequestBody Car car) {
		System.out.println(cars.size());
		System.out.println("in addCar car= " + car);
		HttpStatus status;
		if (car != null) {
			cars.add(car);
			// carService.createCar(car);
			// status = HttpStatus.OK;
		}
		status = HttpStatus.NOT_FOUND;
		return status;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public HttpStatus deleteCar(@RequestBody Car car) {
		System.out.println("I deleteCar car=" + car);
		HttpStatus status;
		if (car != null) {
			System.out.println("del");
			cars.remove(car.getId());
			// carService.deleteCar(car);
			status = HttpStatus.OK;
		}
		status = HttpStatus.NOT_FOUND;
		return status;
	}

}
