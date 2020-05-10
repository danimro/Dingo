package Dingo.Dao;

import Dingo.Entity.Job;

import java.util.Collection;
import java.util.Map;

public class JobDao {
    private static Map<Integer, Job> jobs;

    public Collection<Job> getAllJobs(){
        return this.jobs.values();
    }

    public Job getJobByID(int id){
        return this.jobs.get(id);
    }
}
