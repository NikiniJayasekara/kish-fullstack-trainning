package lk.codelabs.rentcloud.rentservice.hystrix;

import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class VehicleCommand extends HystrixCommand<Vehicle> {
    RestTemplate restTemplate;
    int vehicleId;

    public VehicleCommand(RestTemplate restTemplate, int vehicleId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate=restTemplate;
        this.vehicleId=vehicleId;
    }

  protected Vehicle run() throws Exception{

          return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);

  }
    @Override
    protected Vehicle getFallback() {
        System.out.println("Hit on fallback");
        return new Vehicle();
    }


}
