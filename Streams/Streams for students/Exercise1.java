

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer her
		//(countryDao.findAllCountries()).stream().filter(d->d.getCode() == "AFG").forEach(d->System.out.printf("%s",d.getName()));
		CityDao cityDao = InMemoryWorldDao.getInstance();
	//List<Country> Tag = countryDao.findAllCountries();
	List<City> cList = new ArrayList<>(); 
	/* for(int i =0;i<Tag.size()-1;i++)
	{
		 
		List<City> totalCities = cityDao.findCitiesByCountryCode(Tag.get(i).getCode());
		
		List<City> Final = totalCities.stream().sorted(Comparator.comparingInt(City::getPopulation).reversed()).collect(toList()); //forEach(d->System.out.printf("%d,%s,%d,%s",d.getId(),d.getName(),d.getPopulation(),d.getCountryCode()))
		if(Final.size()!=0)System.out.println(Final.get(0).getId()+" "+Final.get(0).getName()+" "+Final.get(0).getPopulation()+" "+Final.get(0).getCountryCode()+".");
	} */
	cList = countryDao.findAllCountries().stream().map(value -> value.getCities().stream().max(Comparator.comparingInt(City::getPopulation))).filter(Optional::isPresent).map(Optional::get).collect(toList());
	for (int i=0;i<cList.size()-1;i++) System.out.println(cList.get(i));
	
}
}