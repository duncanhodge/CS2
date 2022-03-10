

import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyDriver
{

	public static void main(String[] args)
	{
		ArrayList<Assembly> assemblies = new ArrayList<>();
		String input = "";
		Scanner cin = new Scanner(System.in);

		while (true)
		{
			System.out.println("");
			System.out.print("Enter the assembly number you would like to build (D if done): ");
			input = cin.nextLine();
			if (input.equalsIgnoreCase("D"))
			{
				break;
			}
			
			Assembly assembly = new Assembly(input);

			System.out.println("\nAdd parts:");
			while (true)
			{

				Part part = new Part();
				System.out.print("Part number: ");
				input = cin.nextLine();
				part.setPartNumber(input);

				System.out.print("Serial number: ");
				input = cin.nextLine();
				part.setSerialNumber(input);

				while (true)
				{
					System.out.print("Part weight: ");
					input = cin.nextLine();
					int tempPartNum = Helper.validatePositiveInteger(input);
					if (tempPartNum == -1)
					{
						System.out.println("Invalid weight, must be a positive integer. Try again.");
					} else
					{
						part.setWeight(tempPartNum);
						break;
					}
				}

				while (true)
				{
					System.out.print("Part surface area: ");
					input = cin.nextLine();
					double tempSurfaceArea = Helper.validatePositiveDouble(input);
					if (tempSurfaceArea == -1)
					{
						System.out.println("Invalid surface area, must be a positive floating point value. Try again.");
					} else
					{
						part.setSurfaceArea(tempSurfaceArea);
						break;
					}
				}

				assembly.addPartToAssembly(part);
				
				System.out.print("\nAdd another part to this assembly? (Y or N): ");
				input = cin.nextLine();
				System.out.println();
				if(input.equalsIgnoreCase("N"))
				{
					break;
				}
				
			}
			
			assemblies.add(assembly);
			
		} // end outside while loop

		System.out.println("\nAssembly Report\n============================");
		for (Assembly assembly : assemblies)
		{
			System.out.println(assembly);
		}

		cin.close();
	}

}
