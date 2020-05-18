/*
 * COGNIZANT CONFIDENTIAL AND/OR TRADE SECRET
 *
 * Copyright [2015] - [2020] Cognizant.  All rights reserved.
 *
 * NOTICE: This unpublished material is proprietary to Cognizant and
 * its suppliers, if any.  The methods, techniques and technical
 * concepts herein are considered Cognizant confidential ane/or trade
 * secret information.  This material may be covered by U.S. and/or
 * foreign patents or patent applications.  Use, distribution or
 * copying, in whole or in part, is forbidden, except by express written
 * permission of Cognizant.
 *
 */

package com.emanuel.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckNorrisConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
