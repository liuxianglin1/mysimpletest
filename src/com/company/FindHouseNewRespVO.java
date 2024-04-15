package com.company;




public class FindHouseNewRespVO {

    private String name;

    private Long layoutId;
    private Long apartmentId;

    private Boolean isConcentrated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsConcentrated() {
        return isConcentrated;
    }

    public void setIsConcentrated(Boolean isConcentrated) {
        this.isConcentrated = isConcentrated;
    }

    public Long getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
