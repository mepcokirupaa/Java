package mypkg;

public class CalSportsCategory extends CStudent{

	public CalSportsCategory() {
		// TODO Auto-generated constructor stub
	    sName= " ";
	    nAdno=0;
	    mathsMark1=0;
	    physicsMark1=0;
	    chemistryMark1=0;
	    entMark1=0;
	    bonus=0;

	}
	  public CalSportsCategory(String sName1,int nAdno1,double mathsMark,double physicsMark,double chemistryMark,double entMark)//,int nBonus)
	  {
	    super(sName1,nAdno1,mathsMark,physicsMark,chemistryMark,entMark);
	    //bonus=nBonus;
	  }
	   public double calCutoff(int bonus)
	   {
	      cutoff=(mathsMark1*0.45)+((physicsMark1*0.20)+(chemistryMark1*0.20))/2+(entMark1*0.35)+bonus;
	      return cutoff;
	   }
	   public void Display()
	   {
	    System.out.println("The cutoff is:"+cutoff);
	   }
	

}
