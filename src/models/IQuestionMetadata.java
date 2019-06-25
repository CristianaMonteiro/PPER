/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.models.IQuestionMetadata;

/**
 *
 * @author Cris
 */
public class IQuestionMetadata implements IQuestionMetadata {
    private long Timestamp_start;
    private long Timestamp_finish;

    
    public long getTimestamp_start() {
        return this.Timestamp_start;
        
    }

    public void setTimestamp_start(long l) {
        this.Timestamp_start = l;
        
    }

    public long getTimestamp_finish() {
        return this.Timestamp_finish;
        
    }

    public void setTimestamp_finish(long l) {
        this.Timestamp_finish = l;
        
    }
    
}
