package com.pegaso.ws.dto

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BalanceQueryDto")
@ToString
class BalanceQueryDto {

    int code
    String description
    double availableAmount
}
