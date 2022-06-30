Feature: Manager of bug catcher application should be able to create new defect and assign to testers
        Scenario: Scenario name As a Manager I want to create defects so that I can start assign them
                Given       The manager is on the manager homepage
                When        The manager can add defects in the create defects textbox
                When        The manager can choose the tester from testers selection options
                When        The manager clicks the Click to Assign New Defect button
                Then        the new defect should be shown in the defects table on manager homepage