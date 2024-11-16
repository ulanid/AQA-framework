package task_16.requests;

public class CreateBoardRequest {
    private final String name;
    private final String idOrganization;

    public CreateBoardRequest(String name, String idOrganization) {

        this.name = name;
        this.idOrganization = idOrganization;
    }

    public String getName() { return name; }
    public String getIdOrganization() { return idOrganization; }
}
