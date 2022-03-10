

public class Part
{
	private String partNumber;
	private String serialNumber;
	private int weight;
	private double surfaceArea;
	
	public Part()
	{
		this.partNumber = "";
		this.serialNumber = "";
		this.weight = 0;
		this.surfaceArea = 0d;
	}

	public Part(String partNumber, String serialNumber, int weight, double surfaceArea)
	{
		super();
		this.partNumber = partNumber;
		this.serialNumber = serialNumber;
		this.weight = weight;
		this.surfaceArea = surfaceArea;
	}

	public String getPartNumber()
	{
		return partNumber;
	}

	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public double getSurfaceArea()
	{
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea)
	{
		this.surfaceArea = surfaceArea;
	}

	@Override
	public String toString()
	{
		return "Part [partNumber=" + partNumber + ", serialNumber=" + serialNumber + ", weight=" + weight
				+ ", surfaceArea=" + surfaceArea + "]";
	}
	
}
