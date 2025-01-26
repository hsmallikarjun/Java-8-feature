package Lamda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
			public static void main(String[] args) {
			List<Flatmap_exmple> u=Stream.of(new Flatmap_exmple("Malli","1234",Arrays.asList("m@gmail.com","m2.gmail.com")),
					new Flatmap_exmple("yash","12345",Arrays.asList("y@gmail.com","y2.gmail.com"))).collect(Collectors.toList());
		List<String> pno=u.stream().map(Flatmap_exmple::getPhone).collect(Collectors.toList());
		System.out.println(pno);
		
		List<List<String>> em=u.stream().map(Flatmap_exmple::getEmail).collect(Collectors.toList());
		System.out.println(em);
		
		List<String> email=u.stream().flatMap(m1->m1.getEmail().stream()).collect(Collectors.toList());
		System.out.println(email);
		}

//			output:
//				[1234, 12345]
//						[[m@gmail.com, m2.gmail.com], [y@gmail.com, y2.gmail.com]]
//						[m@gmail.com, m2.gmail.com, y@gmail.com, y2.gmail.com]

}
