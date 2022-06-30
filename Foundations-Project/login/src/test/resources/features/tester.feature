Feature: Tester should be able to accept or decline pending defects

    Scenario:   As a Tester I want to view and accept the pending defects                 
        Given       The Tester is on the Tester homepage
        When        The Tester can clicks on the acccept defect 
        Then        The accepted defect alert should be shown as accepted


    Scenario:   As a Tester I want to view and decline the pending defects            
        Given       The Tester is on the Tester homepage
        When        The Tester can clicks on the decline defect 
        Then        The decline defect alert should be shown as Declined


    Scenario:    As a Tester want change the defect status to reject Rejected     
        Given       The Tester is on the Tester homepage
        When        The tester can clicks on Reject button of the chosen defect
        Then        the rejected defect alert should be shown as Rejected

    Scenario:    As a Tester want change the defect status to fixed        
        Given      The Tester is on the Tester homepage
        When        The tester can clicks on fixed button of the chosen defect
        Then        the fixed defect alert should be shown as Fixed

    Scenario:    As a Tester want change the defect status to shelved     
        Given     The Tester is on the Tester homepage
        When        The tester can clicks on shelved button of the chosen defect
        Then        the shelved defect alert should be shown as Shelved