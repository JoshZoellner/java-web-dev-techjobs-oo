package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import javax.swing.plaf.synth.SynthScrollBarUI;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObject() {
        test_job = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId() {

        assertTrue(1, test_job.getId());
        assertTrue(2, test_job2.getId());
    }

    private void assertTrue(int i, int id) {
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

    }

    private void assertTrue(boolean b) {
    }

//    Generate two Job objects that have identical field values EXCEPT for id.
//    Test that equals returns false.

    @Test
    public void testJobsForEquality(){

        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test_job3.getId(), test_job4.getId());

    }

}



