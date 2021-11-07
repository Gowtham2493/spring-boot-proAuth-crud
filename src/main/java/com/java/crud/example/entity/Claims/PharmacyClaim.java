package com.java.crud.example.entity.Claims;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PharmacyClaim")
@ApiModel(description = "All details about the Pharmacy Claim. ")
public class PharmacyClaim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pharam_claim_id;
    private String claim_num ;
    private String claim_trans_id ;
    private String claim_org_num ;
    private String claim_type ;
    private String claim_org_status ;
    private String claim_status ;
    private String mbr_id ;
    private String mbr_frst_nm ;
    private String mbr_mi_nm ;
    private String mbr_lst_nm ;
    @ApiModelProperty(notes = "Date should be in the format dd-MM-yyyy")
    @Size(min = 8, message = "Date should be in the format dd-MM-yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date mbr_dob ;
    private String mbr_gender ;
    private String rx_num ;
    private String prescr_dt ;
    private String refill_num ;
    @ApiModelProperty(notes = "Date should be in the format dd-MM-yyyy")
    @Size(min = 8, message = "Date should be in the format dd-MM-yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fill_dt ;
    private int ndc ;
    private String drug_nam ;
    private String generic_nam ;
    private String manuf_nam ;
    private String drug_strength ;
    private int qty ;
    private int supl_day ;
    private String drug_dosage ;
    private String daw ;
    private String genric_brand ;
    private String pharm_type ;
    private BigDecimal paid_amt ;
    private String pharm_name ;
    private String pharm_id ;
    private String pharm_addr_ln_1 ;
    private String pharm_addr_ln_2 ;
    private String pharm_county ;
    private String pharm_city ;
    private String pharm_st ;
    private int pharm_zip ;
    private int pharm_tel_ph ;
    private String pharm_email ;
    private String prescr_prvd_id ;
    private int prescr_prvd_npi ;
    private int prescr_prvd_tin ;
    private String prescr_prvd_frst_nm ;
    private String prescr_prvd_lst_nm ;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "claimId")
    private Claims claims;
}
