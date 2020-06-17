package db;

public class Product {
	public String stno;
	public String prdno;
	public String prdna;
	public String prdcl;
	public String prdba;
	public String inprc;
	public String sdprc;
	public String prdrt;
	public String prdbd;
	public String prded;
	public String prvno;


	public Product(String stno, String prdno, String prdna, String prdcl, String prdba, String inprc, String sdprc, String prdrt,
			String prdbd, String prded, String prvno) {
		this.stno = stno;
		this.prdno = prdno;
		this.prdna = prdna;
		this.prdcl = prdcl;
		this.prdba = prdba;
		this.inprc = inprc;
		this.sdprc = sdprc;
		this.prdrt = prdrt;
		this.prdbd = prdbd;
		this.prded = prded;
		this.prvno = prvno;
	}


}
