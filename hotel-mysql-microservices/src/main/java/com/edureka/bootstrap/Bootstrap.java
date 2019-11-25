package com.edureka.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.edureka.model.Hotel;
import com.edureka.repository.HotelRepository;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private HotelRepository hotelRespository;

    public Bootstrap(HotelRepository hotelRespository) {
		this.hotelRespository = hotelRespository;
	}

	@Override
    public void run(String... args) throws Exception {
    	fillHotels();
    }

	private void fillHotels() {
		
		Hotel hilton = Hotel.builder().name("Hilton").description("Hilton Hotels & Resorts is a global brand of full-service hotels and resorts ")
				.city("Riyadh").rating(3).build();
		
        Hotel sheraton  = Hotel.builder().name("Sheraton").description("Sheraton Hotels and Resorts is an international hotel chain")
        		.city("Cairo").rating(4).build();
        
        Hotel marriott = Hotel.builder().name("Marriott").description("Marriott International is an American multinational diversified hospitality company")
        		.city("New York").rating(4).build();
        
        Hotel holidayInn = Hotel.builder().name("Hilton").description("Holiday Inn is a British-owned American brand of hotels").
        		city("Paris").rating(5).build();
        
		Hotel emiratesPalace = Hotel.builder().name("Emirates Palace").description("Set on 85 hectares of landscaped gardens")
				.city("Abu Dhabi").rating(3).build();
		
        Hotel ranchoValencia  = Hotel.builder().name("Rancho Valencia Resort").description("Set on 45 acres of gardens and olive groves, this lavish resort is 6 miles from the Del Mar Racetrack and 10 miles from Torrey Pines State Natural Reserve")
        		.city("California").rating(5).build();
        
        Hotel westinExcelsior = Hotel.builder().name("The Westin Excelsior").description("A 5-minute walk from the nearest metro station, this upscale hotel in an elegant landmark building is also 13 minutes' walk from the Trevi Fountain")
        		.city("Rome").rating(5).build();
        
        Hotel burjAlArab = Hotel.builder().name("Burj Al Arab Hotel").description("Set on an island in a striking sail-shaped building, this luxury hotel is a 5-minute walk from Wild Wadi Water Park and 4 km from Mall of the Emirates").
        		city("Dubai").rating(5).build();

        Hotel plaza = Hotel.builder().name("The Plaza").description("In a landmark 19th-century building opposite Central Park")
				.city("New York").rating(3).build();
		
        Hotel atlantis  = Hotel.builder().name("Atlantis Paradise Island").description("Set along the Atlantic Ocean, this sprawling beachfront resort is 3 km from the lively Nassau Straw Market, 4 km from the 18th-century Fort Fincastle and 19 km from Lynden Pindling")
        		.city("Bahamas").rating(5).build();
        
        Hotel palms = Hotel.builder().name("Palms").description("Set across 3 towers, this upscale casino resort is 0.8 miles from the Las Vegas Strip and 4.4 miles from McCarran International Airport")
        		.city("Las Vegas").rating(4).build();
        
        Hotel boulders = Hotel.builder().name("The Boulders").description("This high-end resort with 2 golf courses is on 1,300 acres in the Sonoran Desert foothills north of Scottsdale").
        		city("Arizona").rating(3).build();
        
        hotelRespository.save(hilton);
        hotelRespository.save(sheraton);
        hotelRespository.save(marriott);
        hotelRespository.save(holidayInn);
        hotelRespository.save(emiratesPalace);
        hotelRespository.save(ranchoValencia);
        hotelRespository.save(westinExcelsior);
        hotelRespository.save(burjAlArab);
        hotelRespository.save(plaza);
        hotelRespository.save(atlantis);
        hotelRespository.save(palms);
        hotelRespository.save(boulders);

        System.out.println("Hotels Data Loaded = " + hotelRespository.count() );

	}

}
