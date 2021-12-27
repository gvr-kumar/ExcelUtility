package com.excel.pojo;



import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class BookToFile {

    @ExcelRow                   
    private int rowIndex;

    @ExcelCellName("Book")               
    private String book;    

    @ExcelCellName("Description")
    private String description;

    @ExcelCellName("Portfolio Type")
    private String portifolio_type;

    @ExcelCellName("Dealer")
    private String dealer;

    @ExcelCellName("WellsFargo Entity")
    private String wellsfargoEntiry;

	@Override
	public String toString() {
		return "BookToFile [rowIndex=" + rowIndex + ", book=" + book + ", description=" + description
				+ ", portifolio_type=" + portifolio_type + ", dealer=" + dealer + ", wellsfargoEntiry="
				+ wellsfargoEntiry + "]";
	}
    
    //no need getters/setters to map excel cells to fields
    
    
    
    
}