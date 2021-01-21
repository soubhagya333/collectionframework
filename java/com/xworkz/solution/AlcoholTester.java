package com.xworkz.solution;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.solution.dto.AlcoholDTO;

public class AlcoholTester {

	public static void main(String[] args) {
				AlcoholDTO alcoholDTO1 = new AlcoholDTO("IB", "Imperial", 48);

				AlcoholDTO alcoholDTO2 = new AlcoholDTO("Amstel", "King Fisher", 4);

				AlcoholDTO alcoholDTO3 = new AlcoholDTO("Magic Moments", "NA", 38);

				AlcoholDTO alcoholDTO4 = new AlcoholDTO("Old Monk", "NA", 42);

				List<AlcoholDTO> alcoholDTOs = new ArrayList<AlcoholDTO>(100);
				alcoholDTOs.add(alcoholDTO4);
				alcoholDTOs.add(1, alcoholDTO2);
				alcoholDTOs.add(alcoholDTO3);//magic moments
				alcoholDTOs.add(alcoholDTO1);//IB

				// alcoholDTOs.remove(alcoholDTO3);
				//alcoholDTOs.remove(2);

				AlcoholDTO alcoholDTO5 = new AlcoholDTO("Bud Wiser", "King Fisher", 8);

				alcoholDTOs.add(4, alcoholDTO5);
				
				
				int index=alcoholDTOs.indexOf(alcoholDTO5);
				System.out.println("indexOf"+index);
				
				int lastIndex=alcoholDTOs.lastIndexOf(alcoholDTO3);
				System.out.println("lastIndex"+lastIndex);
				for (AlcoholDTO alcoholDTO : alcoholDTOs) {
					System.out.println(alcoholDTO);
				}
			}

		}
		
		
		
