package com.sda.travelagency.converter;

import com.sda.travelagency.dto.SecurityRulesDto;
import com.sda.travelagency.entity.SecurityRules;
import org.springframework.stereotype.Component;


@Component
public class SecurityRulesConverter implements Converter<SecurityRules, SecurityRulesDto> {
    @Override
    public SecurityRulesDto fromEntityToDto(SecurityRules entity) {
        return null;//TODO
    }

    @Override
    public SecurityRules fromDtoToEntity(SecurityRulesDto dto) {
        return null;//TODO
    }
}