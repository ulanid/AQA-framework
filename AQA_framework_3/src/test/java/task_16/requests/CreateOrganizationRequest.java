package task_16.requests;

public class CreateOrganizationRequest {
    private final String displayName;
    private final String website;
    private final String desc;
    private final String name;

    public CreateOrganizationRequest(String displayName, String website, String desc, String name) {

        this.displayName = displayName;
        this.website = website;
        this.desc = desc;
        this.name = name;
    }

    public String getDisplayName() { return displayName; }
    public String getWebsite() { return website; }
    public String getDesc() { return desc; }
    public String getName() { return name; }
}
