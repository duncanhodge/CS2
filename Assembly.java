

import java.util.ArrayList;

public class Assembly
{
	private String assemblyName;
	private ArrayList<Part> parts;
	
	public Assembly(String assemblyName)
	{
		this.parts = new ArrayList<>();
		this.assemblyName = assemblyName;
	}
	
	public void addPartToAssembly(Part part)
	{
		this.parts.add(part);
	}

	public String getAssemblyName()
	{
		return assemblyName;
	}

	public ArrayList<Part> getParts()
	{
		return parts;
	}
	
	private double calculateTotalSurfaceArea()
	{
		double tempSurfaceArea = 0d;
		for(Part part : parts)
		{
			tempSurfaceArea += part.getSurfaceArea();
		}
		return tempSurfaceArea;
	}
	
	private int calculateTotalWeight()
	{
		int tempWeight = 0;
		for(Part part : parts)
		{
			tempWeight += part.getWeight();
		}
		return tempWeight;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\nAssembly Name: " + assemblyName);
		sb.append("\nTotal Weight: " + this.calculateTotalWeight());
		sb.append("\nTotal Surface Area: " + this.calculateTotalSurfaceArea());
		
		for(Part part : parts)
		{
			sb.append("\n" + part);
		}
		
		return sb.toString();
	}
	
}
