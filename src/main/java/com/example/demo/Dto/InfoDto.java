package com.example.demo.Dto;

import com.example.demo.services.models.Info;
import com.example.demo.services.models.User;

public class InfoDto {
    private String seed;
    private Integer results;
    private Integer page;
    private String version;

    public InfoDto() {

    }

    public String getSeed() { return this.seed; }
    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Integer getResults() { return this.results; }
    public void setResults(Integer results) { this.results = results; }

    public Integer getPage() { return this.page; }
    public void setPage(Integer page) { this.page = page; }

    public String getVersion() { return this.version; }
    public void setVersion(String version) {
        this.version = version;
    }


    public static InfoDto ConvertUserModelToInfoDto(Info info) {
        var wipInfoDto = new InfoDto();

        if (info == null) {
            return null;
        }

        var seed = info.getSeed();
        var page = info.getPage();
        var results = info.getResults();
        var version = info.getVersion();
        wipInfoDto.setSeed(seed);
        wipInfoDto.setPage(page);
        wipInfoDto.setResults(results);
        wipInfoDto.setVersion(version);

        return wipInfoDto;
    }
}
