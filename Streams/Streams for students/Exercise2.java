

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;
import static java.util.stream.Collectors.toList;
import java.util.HashMap;



public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
   //      write your answer here
   CityDao cityDao = InMemoryWorldDao.getInstance();
	Set<String> countryToContinent = countryDao.getAllContinents();
	List<String> continents= new ArrayList<>();
	List<Country> Tag = countryDao.findAllCountries();
	for(String key : countryToContinent) continents.add(key);
	List<City> Final = new ArrayList<>();
	List<City> Calculations = new ArrayList<>();
	
	for(int j=0;j<continents.size();j++){
		Tag = countryDao.findCountriesByContinent(continents.get(j));
		Calculations.clear();
	for(int i =0;i<Tag.size();i++)
	{		
		List<City> totalCities = cityDao.findCitiesByCountryCode(Tag.get(i).getCode());
		Calculations.addAll(totalCities);		
	}
	Final = Calculations.stream().sorted(Comparator.comparingInt(City::getPopulation).reversed()).collect(toList());
	if(Final.size()!=0){
			System.out.println(Final.get(0).getId()+" "+Final.get(0).getName()+" "+Final.get(0).getPopulation()+" "+Final.get(0).getCountryCode()+" "+continents.get(j)+".");
	}
	Final.clear();
    }

}
}