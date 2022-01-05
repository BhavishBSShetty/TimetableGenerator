import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Helper {
	static List<PriorityQueue<Entity>> getDummyData(){
		
		Faculty chinmay = new Faculty("Chinmay", 101);
		Faculty jason = new Faculty("Jason", 102);
		Faculty prateeksha = new Faculty("Pratheeksha", 103);
		Faculty deepa = new Faculty("Deepa", 104);
		Faculty kumudakshi = new Faculty("Kumudakshi", 105);
		Faculty pratyakshini = new Faculty("Pratyakshini", 106);
		Faculty balaji = new Faculty("Balaji", 107);
		Faculty rashmi = new Faculty("Rashmi", 108);
		Faculty preeti = new Faculty("Preeti", 109);
		Faculty bhavya = new Faculty("Bhavya", 110);
		Faculty manjula = new Faculty("Manjula", 111);
		Faculty anusha = new Faculty("Anusha", 112);
		Faculty abhir = new Faculty("Abhir", 113);
		Faculty shashirekha = new Faculty("Shashirekha", 114);
		Faculty alakha = new Faculty("Alakha", 115);
		Faculty santhosh = new Faculty("Santhosh", 116);
		Faculty Manjulata = new Faculty("Manjulata", 117);
		Faculty smitha = new Faculty("Smitha", 118);
		Faculty sandhya = new Faculty("Sandhya", 119);
		Faculty karuna = new Faculty("Karuna", 120);
		Faculty vanajakshi = new Faculty("Vanajakshi", 121);
		Faculty sapna = new Faculty("Sapna", 122);
		Faculty sunil = new Faculty("Bola Sunil", 123);
		Faculty ravi = new Faculty("Ravi", 124);
		Faculty nikita = new Faculty("Sapna", 125);
		Faculty tanzila = new Faculty("Tanzila", 126);
		Faculty austin = new Faculty("Austin", 127);
		Faculty vasudev = new Faculty("Vasudev", 128);
		Faculty somayaji = new Faculty("Somayaji", 129);
		 
		 
		 
		// 2nd yr subjects
		Subject dsa = new Subject("DSA", 4, 2);
		Subject co = new Subject("CO", 3, 2);
		Subject se = new Subject("SE", 2, 2);
		Subject unix = new Subject("Unix", 3, 3);
		Subject dms = new Subject("DMS", 2, 2);
		
		// 3rd yr subjects
		Subject dsm = new Subject("DSM", 4, 3);
		Subject fafl = new Subject("FAFL", 3, 3);
		Subject dm = new Subject("DM", 2, 3);
		Subject os = new Subject("OS", 3, 3);
		
		//4th yr subjects
		Subject em = new Subject("EM", 4, 4);
		Subject ins = new Subject("INS", 3, 4);
		Subject cc = new Subject("CC", 3, 4);
		Subject oe = new Subject("OE", 2, 4);
		
		

		// 2nd yr
		Entity A_2_1 = new Entity(dsa, chinmay);
		Entity A_2_2 = new Entity(co, jason);
		Entity A_2_3 = new Entity(unix, prateeksha);
		Entity A_2_4 = new Entity(se, deepa);
		Entity A_2_5 = new Entity(dms, kumudakshi);
		PriorityQueue<Entity> A_2_sec = new PriorityQueue<Entity>();
		A_2_sec.add(A_2_1);
		A_2_sec.add(A_2_2);
		A_2_sec.add(A_2_3);
		A_2_sec.add(A_2_4);
		A_2_sec.add(A_2_5);
		
		Entity B_2_1 = new Entity(dsa, pratyakshini);
		Entity B_2_2 = new Entity(co, balaji);
		Entity B_2_3 = new Entity(unix,rashmi);
		Entity B_2_4 = new Entity(se, preeti);
		Entity B_2_5 = new Entity(dms, bhavya);
		PriorityQueue<Entity> B_2_sec = new PriorityQueue<Entity>();
		B_2_sec.add(B_2_1);
		B_2_sec.add(B_2_2);
		B_2_sec.add(B_2_3);
		B_2_sec.add(B_2_4);
		B_2_sec.add(B_2_5);
		
		Entity C_2_1 = new Entity(dsa, prateeksha);
		Entity C_2_2 = new Entity(co, manjula);
		Entity C_2_3 = new Entity(unix, anusha);
		Entity C_2_4 = new Entity(se, abhir);
		Entity C_2_5 = new Entity(dms, shashirekha);
		PriorityQueue<Entity> C_2_sec = new PriorityQueue<Entity>();
		C_2_sec.add(C_2_1);
		C_2_sec.add(C_2_2);
		C_2_sec.add(C_2_3);
		C_2_sec.add(C_2_4);
		C_2_sec.add(C_2_5);
		
		Entity D_2_1 = new Entity(dsa, alakha);
		Entity D_2_2 = new Entity(co, santhosh);
		Entity D_2_3 = new Entity(unix, pratyakshini);
		Entity D_2_4 = new Entity(se, Manjulata);
		Entity D_2_5 = new Entity(dms, smitha);
		PriorityQueue<Entity> D_2_sec = new PriorityQueue<Entity>();
		D_2_sec.add(D_2_1);
		D_2_sec.add(D_2_2);
		D_2_sec.add(D_2_3);
		D_2_sec.add(D_2_4);
		D_2_sec.add(D_2_5);
		
		

		// 3rd yr
		Entity A_3_1 = new Entity(dsm, sandhya);
		Entity A_3_2 = new Entity(fafl, karuna);
		Entity A_3_3 = new Entity(dm, balaji);
		Entity A_3_4 = new Entity(os, santhosh);
		PriorityQueue<Entity> A_3_sec = new PriorityQueue<Entity>();
		A_3_sec.add(A_3_1);
		A_3_sec.add(A_3_2);
		A_3_sec.add(A_3_3);
		A_3_sec.add(A_3_4);
		
		Entity B_3_1 = new Entity(dsm, vanajakshi);
		Entity B_3_2 = new Entity(fafl, karuna);
		Entity B_3_3 = new Entity(dm,sapna);
		Entity B_3_4 = new Entity(os, sunil);
		PriorityQueue<Entity> B_3_sec = new PriorityQueue<Entity>();
		B_3_sec.add(B_3_1);
		B_3_sec.add(B_3_2);
		B_3_sec.add(B_3_3);
		B_3_sec.add(B_3_4);
		
		Entity C_3_1 = new Entity(dsm, sandhya);
		Entity C_3_2 = new Entity(fafl, karuna);
		Entity C_3_3 = new Entity(dm, balaji);
		Entity C_3_4 = new Entity(os, santhosh);
		PriorityQueue<Entity> C_3_sec = new PriorityQueue<Entity>();
		C_3_sec.add(C_3_1);
		C_3_sec.add(C_3_2);
		C_3_sec.add(C_3_3);
		C_3_sec.add(C_3_4);
		
		Entity D_3_1 = new Entity(dsm, jason);
		Entity D_3_2 = new Entity(fafl, ravi);
		Entity D_3_3 = new Entity(dm, nikita);
		Entity D_3_4 = new Entity(os, tanzila);
		PriorityQueue<Entity> D_3_sec = new PriorityQueue<Entity>();
		D_3_sec.add(D_3_1);
		D_3_sec.add(D_3_2);
		D_3_sec.add(D_3_3);
		D_3_sec.add(D_3_4);
		
		
		// 4th yr
		Entity A_4_1 = new Entity(em, austin);
		Entity A_4_2 = new Entity(ins, vasudev);
		Entity A_4_3 = new Entity(cc, abhir);
		Entity A_4_4 = new Entity(oe, santhosh);
		PriorityQueue<Entity> A_4_sec = new PriorityQueue<Entity>();
		A_4_sec.add(A_4_1);
		A_4_sec.add(A_4_2);
		A_4_sec.add(A_4_3);
		A_4_sec.add(A_4_4);
		
		Entity B_4_1 = new Entity(em, somayaji);
		Entity B_4_2 = new Entity(ins, rashmi);
		Entity B_4_3 = new Entity(cc, pratyakshini);
		Entity B_4_4 = new Entity(oe, chinmay);
		PriorityQueue<Entity> B_4_sec = new PriorityQueue<Entity>();
		B_4_sec.add(B_4_1);
		B_4_sec.add(B_4_2);
		B_4_sec.add(B_4_3);
		B_4_sec.add(B_4_4);
		
		Entity C_4_1 = new Entity(em, sandhya);
		Entity C_4_2 = new Entity(ins, austin);
		Entity C_4_3 = new Entity(cc, abhir);
		Entity C_4_4 = new Entity(oe, karuna);
		PriorityQueue<Entity> C_4_sec = new PriorityQueue<Entity>();
		C_4_sec.add(C_4_1);
		C_4_sec.add(C_4_2);
		C_4_sec.add(C_4_3);
		C_4_sec.add(C_4_4);
		
		Entity D_4_1 = new Entity(em, vanajakshi);
		Entity D_4_2 = new Entity(ins, balaji);
		Entity D_4_3 = new Entity(cc, manjula);
		Entity D_4_4 = new Entity(oe, anusha);
		PriorityQueue<Entity> D_4_sec = new PriorityQueue<Entity>();
		D_4_sec.add(D_4_1);
		D_4_sec.add(D_4_2);
		D_4_sec.add(D_4_3);
		D_4_sec.add(D_4_4);
		
		
		
		
		List<PriorityQueue<Entity>> entries = new LinkedList<>();
		
		entries.add(A_2_sec);
		entries.add(B_2_sec);
		entries.add(C_2_sec);
		entries.add(D_2_sec);
		
		entries.add(A_3_sec);
		entries.add(B_3_sec);
		entries.add(C_3_sec);
		entries.add(D_3_sec);
		
		entries.add(A_4_sec);
		entries.add(B_4_sec);
		entries.add(C_4_sec);
		entries.add(D_4_sec);
		
		return entries;
	}
	
	static void printInitialTemplate(String className) {
		for(int l=0; l<76; l++) {
			System.out.print("-");
		}
		System.out.print(className);
		for(int l=0; l<76; l++) {
			System.out.print("-");
		}
		System.out.println();
		for(int l=0; l<157; l++) {
			System.out.print("-");
		}
		System.out.print("\n         |");
		for(int l=0; l<7; l++) {
			System.out.print("         "+(l+1)+"          |");
		}
		System.out.println();
		
		for(int l=0; l<157; l++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	static void printTimeTable(Entry tt[][][]) {
		
		List<String> className = new LinkedList<String>();
		
		className.add("III A");
		className.add("III B");
		className.add("III C");
		className.add("III D");
		className.add("V A");
		className.add("V B");
		className.add("V C");
		className.add("V D");
		className.add("VII A");
		className.add("VII B");
		className.add("VII C");
		className.add("VII D");
		
		
		List<String> days = new LinkedList<String>();
		
		days.add("Mon      |");
		days.add("Tue      |");
		days.add("Wed      |");
		days.add("Thu      |");
		days.add("Fri      |");
		days.add("Sat      |");
	
		
		for(int i=0; i<tt.length; i++) {
			printInitialTemplate(className.get(i));
			
			for(int j=0; j<6; j++) {
				System.out.print(days.get(j));
				for(int k=0; k<7; k++) {
					Entry temp = tt[i][j][k];
					if(temp != null) {
						String prinString = temp.subject.name+"-"+temp.teacher.name;
						int remLength = 20 - prinString.length();
						System.out.print(prinString);
						for(int p=0; p<remLength; p++) {
							System.out.print(" ");
						}
						System.out.print("|");				
					}
					else
						System.out.print("         NA         |");
				}
				System.out.println();
				for(int l=0; l<157; l++) {
					System.out.print("-");
				}
				System.out.println();
			}
			System.out.println("\n\n");
		}
	}
}


/*
 * 
 * 				
 * 				2nd yr - 5 subjects
 * 
 * 
 * 					A section
 * 				DSA - Chinamy - 101 - 4
 *				CO - Jason - 102 - 3
 *				Unix - Pratheeksha - 103 - 3
 *				SE - Deepa - 104 - 2
 *				DMS - Kumudakshi - 105 - 2
 *				
 *  				B section
 * 				DSA - Pratyakshini - 106 - 4
 *				CO - Balaji - 107 - 3
 *				Unix - Rashmi - 108 - 3
 *				SE - Preeti - 109 - 2
 *				DMS - Bhavya - 110 - 2
 *
 *  				C section
 * 				DSA - Pratheeksha - 103 - 4
 *				CO - Manjula - 111 - 3
 *				Unix - Anusha - 112 - 3
 *				SE - Abhir - 113 - 2
 *				DMS - Shashirekha - 114 - 2
 *
 *
 *					D section
 *				DSA - Alakha - 115 - 4
 *				CO - Santhosh - 116 - 3
 *				Unix - Pratyakshini - 106 - 3
 *				SE - Manjulata - 117 - 2
 *				DMS - Smitha - 118 - 2
 *		
 *
 *				
 *				3rd yr - 4 subjects
 *
 *					A section
 *				DSM - Sandhya - 119 - 4
 *				FAFL - Karuna - 120 - 3
 *				DM - Balaji - 107 - 2
 *				OS - Santhosh - 116 - 3 
 *
 *					B section
 *				DSM - Vanajakshi - 121 - 4
 *				FAFL - Karuna - 120 - 3
 *				DM - Sapna - 122 - 2
 *				OS - Bola Sunil - 123 - 3 
 *
 *					C section
 *				DSM - Sandhya - 119 - 4
 *				FAFL - Karuna - 120 - 3
 *				DM - Balaji - 107 - 2
 *				OS - Santhosh - 116 - 3 
 *
 *					D section
 *				DSM - Jason - 102 - 4
 *				FAFL - Ravi - 124 - 3
 *				DM - Nikita - 125 - 2
 *				OS - Tanzila - 126 - 3 
 *
 *
 *				4th yr - 4 subjects
 *
 *					A section
 *				EM - Austin - 127 - 4
 *				INS - Vasudev - 128 - 3
 *				CC - Abhir - 113 - 3
 *				OE - Sathosh - 116 - 2
 *
 *					B section
 *				EM - Somayaji - 129 - 4
 *				INS - Rashmi - 108 - 3
 *				CC - Prathyakshini - 106 - 3
 *				OE - Chinmay - 101 - 2
 *
 *					C section
 * 				EM - Sandhy - 119 - 4
 *				INS - Austin - 127 - 3
 *				CC - Abhir - 113 - 3
 *				OE - Karuna - 120 - 2
 *
 *					D section
 * 				EM - Vanajakshi - 121 - 4
 *				INS - Balaji - 107 - 3
 *				CC - Manjula - 111 - 3
 *				OE - Anusha - 112 - 2
 *
 
*/
