package task_16.utils;

import task_16.responses.OrganizationResponse;

public class OrganizationResponseComparator {
    public static boolean compare(OrganizationResponse expected, OrganizationResponse actual) {
        return expected.getId().equals(actual.getId()) &&
                expected.getDisplayName().equals(actual.getDisplayName()) &&
                expected.getDesc().equals(actual.getDesc()) &&
                expected.getWebsite().equals(actual.getWebsite());
    }
}
