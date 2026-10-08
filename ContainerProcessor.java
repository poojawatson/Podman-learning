package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContainerProcessor {

    private static final Logger log =
            LoggerFactory.getLogger(ContainerProcessor.class);

    public static void main(String[] args) {

        log.info("Container loaded");

        log.info("QC Job Started");

      
    }

    private static void validateContainer() {
        throw new RuntimeException("Container validation error");
    }
}