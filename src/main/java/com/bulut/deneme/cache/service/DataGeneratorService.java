package com.bulut.deneme.cache.service;

import com.bulut.deneme.cache.dto.SampleDTO;

import java.util.List;

public interface DataGeneratorService {

    List<SampleDTO> getSampleData();

    SampleDTO save(SampleDTO sampleDTO);

    void delete(long id);

    SampleDTO update(SampleDTO sampleDTO);
}
