package com.gabriel.springpetclinic.services.map;

import com.gabriel.springpetclinic.model.Speciality;
import com.gabriel.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {
}
