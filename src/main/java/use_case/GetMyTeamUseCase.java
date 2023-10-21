package use_case;

import api.GradeDB;
import entity.Team;
import org.json.JSONException;

public final class GetMyTeamUseCase {

    private final GradeDB gradeDB;

    public GetMyTeamUseCase(GradeDB gradeDB) {
        this.gradeDB = gradeDB;
    }

    public Team getMyTeam() throws JSONException {
        return gradeDB.getMyTeam();
    }
}
