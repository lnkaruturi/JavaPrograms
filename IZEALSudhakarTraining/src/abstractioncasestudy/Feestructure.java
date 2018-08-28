package abstractioncasestudy;

abstract class Fee
{
	public int getCautionDeposit()
		{
			return 5000;
		}
		abstract public int getTutionfee();
		abstract public int getTotalfee();
}
class LKG extends Fee
{
	
	public int getTutionfee()
	{
		return 40000;
	}
	public int getTotalfee()
	{
		int cautiondeposit = getCautionDeposit();
		int Tutionfee= getTutionfee();
		return  cautiondeposit + Tutionfee;
		
	}
	
}
class UKG extends Fee
{
	public int getTutionfee()
	{
		return 45000;
	}
	public int getTotalfee()
	{
		int cautiondeposit = getCautionDeposit();
		int Tutionfee= getTutionfee();
		return cautiondeposit + Tutionfee;
	}
	
}
class First extends Fee
{
	public int getTutionfee()
	{
		return 50000;
	}
	public int getTotalfee()
	{
		int cautiondeposit = getCautionDeposit();
		int Tutionfee= getTutionfee();
		return cautiondeposit + Tutionfee;
	}
}
class Tenth extends Fee
{
	public int getTutionfee()
	{
		return 95000;
	}
	public int getTotalfee()
	{
		int cautiondeposit = getCautionDeposit();
		int Tutionfee= getTutionfee();
		return cautiondeposit + Tutionfee;
	}
}
abstract class Feestructure extends Fee
{
	public static void main(String[] args) {
		LKG o1= new LKG();
		o1.getCautionDeposit();
		o1.getTotalfee();
		o1.getTutionfee();
	}
}
