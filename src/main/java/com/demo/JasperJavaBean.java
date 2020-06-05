package com.demo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;

public class JasperJavaBean {
    private String name;  // 资产名称
    private String accuquiredPeriod; // 购买期间
    private String entryPeriod;// 录入期间
    private BigDecimal baseOriginalValue= BigDecimal.ZERO; // 原值
    private String depnPatternEnumValue;// 折旧方式
    private Integer usefulLifeMonths; // 使用期限
    private BigDecimal salvageValuePct= BigDecimal.ZERO; // 残值率
    private BigDecimal baseOpenningDepnAmount= BigDecimal.ZERO; // 期初累计折旧
    private BigDecimal baseNetValue= BigDecimal.ZERO; // 净值
    private BigDecimal baseCurrentDepnAmount= BigDecimal.ZERO; // 本月折旧
    private BigDecimal baseEndAccuDepnAmount= BigDecimal.ZERO; // 期末累计折旧
    private String expenseGlAccountIdLongName; // 费用科目
    private String depnGlAccountIdLongName; // 折旧科目
    private String code;  // 资产编码
    private String fixedAssetTypeName; // 类别名称
    //NHKJ-7122-固定资产清单下载增加使用部门
    private String departmentName;  // 使用部门
    private String bizEmployeeName;  // 使用人员
    private String place;  // 存放地点
    //NHKJ-7122-固定资产清单下载增加使用部门

    //NHKJ-11408-固定资产清单下载，无规格型号和数量，请补充
    private String specNo;//
    private BigDecimal quantity ;

    public JasperJavaBean(String code,String name,  String fixedAssetTypeName, String accuquiredPeriod, BigDecimal baseOriginalValue, Integer usefulLifeMonths,String depnPatternEnumValue,BigDecimal salvageValuePct,BigDecimal baseOpenningDepnAmount,BigDecimal baseNetValue,BigDecimal baseCurrentDepnAmount,String specNo, BigDecimal quantity,
                          String departmentName, String bizEmployeeName, String place,BigDecimal baseEndAccuDepnAmount,  String expenseGlAccountIdLongName, String depnGlAccountIdLongName,String entryPeriod) {
        this.name = name;
        this.accuquiredPeriod = accuquiredPeriod;
        this.entryPeriod = entryPeriod;
        this.baseOriginalValue = baseOriginalValue;
        this.depnPatternEnumValue = depnPatternEnumValue;
        this.usefulLifeMonths = usefulLifeMonths;
        this.salvageValuePct = salvageValuePct;
        this.baseOpenningDepnAmount = baseOpenningDepnAmount;
        this.baseNetValue = baseNetValue;
        this.baseCurrentDepnAmount = baseCurrentDepnAmount;
        this.baseEndAccuDepnAmount = baseEndAccuDepnAmount;
        this.expenseGlAccountIdLongName = expenseGlAccountIdLongName;
        this.depnGlAccountIdLongName = depnGlAccountIdLongName;
        this.code = code;
        this.fixedAssetTypeName = fixedAssetTypeName;
        this.departmentName = departmentName;
        this.bizEmployeeName = bizEmployeeName;
        this.place = place;
        this.specNo = specNo;
        this.quantity = quantity;
    }

    public String getSpecNo() {
        return specNo;
    }
    public void setSpecNo(String specNo) {
        this.specNo = specNo;
    }
    public BigDecimal getQuantity() {
        return quantity;
    }
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    //NHKJ-11408-固定资产清单下载，无规格型号和数量，请补充

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccuquiredPeriod() {
        return accuquiredPeriod;
    }
    public void setAccuquiredPeriod(String accuquiredPeriod) {
        this.accuquiredPeriod = accuquiredPeriod;
    }
    public String getEntryPeriod() {
        return entryPeriod;
    }
    public void setEntryPeriod(String entryPeriod) {
        this.entryPeriod = entryPeriod;
    }
    public BigDecimal getBaseOriginalValue() {
        return baseOriginalValue;
    }
    public void setBaseOriginalValue(BigDecimal baseOriginalValue) {
        this.baseOriginalValue = baseOriginalValue;
    }
    public String getDepnPatternEnumValue() {
        return depnPatternEnumValue;
    }
    public void setDepnPatternEnumValue(String depnPatternEnumValue) {
        this.depnPatternEnumValue = depnPatternEnumValue;
    }
    public Integer getUsefulLifeMonths() {
        return usefulLifeMonths;
    }
    public void setUsefulLifeMonths(Integer usefulLifeMonths) {
        this.usefulLifeMonths = usefulLifeMonths;
    }
    public BigDecimal getSalvageValuePct() {
        return salvageValuePct;
    }
    public void setSalvageValuePct(BigDecimal salvageValuePct) {
        this.salvageValuePct = salvageValuePct;
    }
    public BigDecimal getBaseOpenningDepnAmount() {
        return baseOpenningDepnAmount;
    }
    public void setBaseOpenningDepnAmount(BigDecimal baseOpenningDepnAmount) {
        this.baseOpenningDepnAmount = baseOpenningDepnAmount;
    }
    public BigDecimal getBaseNetValue() {
        return baseNetValue;
    }
    public void setBaseNetValue(BigDecimal baseNetValue) {
        this.baseNetValue = baseNetValue;
    }
    public BigDecimal getBaseCurrentDepnAmount() {
        return baseCurrentDepnAmount;
    }
    public void setBaseCurrentDepnAmount(BigDecimal baseCurrentDepnAmount) {
        this.baseCurrentDepnAmount = baseCurrentDepnAmount;
    }
    public BigDecimal getBaseEndAccuDepnAmount() {
        return baseEndAccuDepnAmount;
    }
    public void setBaseEndAccuDepnAmount(BigDecimal baseEndAccuDepnAmount) {
        this.baseEndAccuDepnAmount = baseEndAccuDepnAmount;
    }
    public String getExpenseGlAccountIdLongName() {
        return expenseGlAccountIdLongName;
    }
    public void setExpenseGlAccountIdLongName(String expenseGlAccountIdLongName) {
        this.expenseGlAccountIdLongName = expenseGlAccountIdLongName;
    }
    public String getDepnGlAccountIdLongName() {
        return depnGlAccountIdLongName;
    }
    public void setDepnGlAccountIdLongName(String depnGlAccountIdLongName) {
        this.depnGlAccountIdLongName = depnGlAccountIdLongName;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getBizEmployeeName() {
        return bizEmployeeName;
    }
    public void setBizEmployeeName(String bizEmployeeName) {
        this.bizEmployeeName = bizEmployeeName;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public String getFixedAssetTypeName() {
        return fixedAssetTypeName;
    }

    public void setFixedAssetTypeName(String fixedAssetTypeName) {
        this.fixedAssetTypeName = fixedAssetTypeName;
    }
}

