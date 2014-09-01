package com.greptilian.javaone2014bof5619.dataverse;

// NB: in actual code, this is an interface
public abstract class CommandContext {

    private DatasetServiceBean datasetServiceBean;
    private DataFileServiceBean dataFileServiceBean;

    public DatasetServiceBean getDatasetServiceBean() {
        return datasetServiceBean;
    }

    public DataFileServiceBean getDataFileServiceBean() {
        return dataFileServiceBean;
    }

}
