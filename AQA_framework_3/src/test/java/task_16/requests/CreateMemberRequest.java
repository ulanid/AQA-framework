package task_16.requests;

public class CreateMemberRequest {
    private final String email;
    private final String fullName;

    public CreateMemberRequest(String email, String fullName) {
        this.email = email;
        this.fullName = fullName;
    }

    public final String getEmail() { return email; }
    public final String getFullName() { return fullName; }
}
