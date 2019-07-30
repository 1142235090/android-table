package table.smartonet.com.myapplication;

import java.util.Date;

/**
 * Creat by hanzhao
 * on 2019/7/25
 **/
public class MeasuredValue {
    /** 主键 */
    private Long id;
    /** 设备id */
    private Long deviceId;
    /** 测量值 */
    private String value;
    /** 测量值类型：如“value”测量值。“avg”平均值 */
    private String valueType;
    /** 测量项名称：如“b值”、“第一量程k值”、“2mg/L”、“零点漂移”、“量程漂移” */
    private String valueName;
    /** 测量项标识：如“calculate_b” */
    private String valueSign;
    /** 测量项所属组：1测量项目（包括“b值”、“第一量程k值”等），2性能指标（包括“2mg/L”等、“零点漂移”、“量程漂移”等） */
    private Integer group;
    /** 测量时间 */
    private Date createOn;
    /** 删除标志,0:未删除，1：已删除 */
    private Integer deleteSign;
    /** 数据状态，0：正常，1：异常 */
    private Integer status;
    /** 数据是否有效，0：有效数据，1：无效数据 */
    private Integer isValid;
    /** 数据异常说明 */
    private String description;
    /** 处理警告的用户 */
    private Long user;
    /** 处理警告的用户 */
    private String firstName;
    /** 单位 */
    private String unit;
    /** 标准 */
    private String standard;


    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getDeviceId(){
        return this.deviceId;
    }
    public void setDeviceId(Long deviceId){
        this.deviceId = deviceId;
    }

    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public String getValueType(){
        return this.valueType;
    }
    public void setValueType(String valueType){
        this.valueType = valueType;
    }

    public String getValueName(){
        return this.valueName;
    }
    public void setValueName(String valueName){
        this.valueName = valueName;
    }

    public String getValueSign(){
        return this.valueSign;
    }
    public void setValueSign(String valueSign){
        this.valueSign = valueSign;
    }

    public Integer getGroup(){
        return this.group;
    }
    public void setGroup(Integer group){
        this.group = group;
    }

    public Date getCreateOn(){
        return this.createOn;
    }
    public void setCreateOn(Date createOn){
        this.createOn = createOn;
    }

    public Integer getDeleteSign(){
        return this.deleteSign;
    }
    public void setDeleteSign(Integer deleteSign){
        this.deleteSign = deleteSign;
    }

    public Integer getStatus(){
        return this.status;
    }
    public void setStatus(Integer status){
        this.status = status;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public Long getUser(){
        return this.user;
    }
    public void setUser(Long user){
        this.user = user;
    }

    public String getUnit(){
        return this.unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
