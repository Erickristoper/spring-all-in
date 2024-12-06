package com.delsocorro.fight.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.delsocorro.fight.model.Technique;

@Repository
public class TechniqueRepository {

    private final JdbcTemplate jdbc;

    public TechniqueRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void addTechnique(Technique t) {
        String sql = "INSERT INTO technique VALUES(?,?,?,?,?,?)";

        jdbc.update(sql, t.getId(), t.getName(), t.getDescription(), t.getCategory(), t.getTags(), t.getHitPoint());
    }

    public List<Technique> findAllTechniques() {
        String sql = "SELECT * FROM technique";

        RowMapper<Technique> techMapper = (r, i) -> {
            Technique rowObject = new Technique();
            rowObject.setId(r.getInt("id"));
            rowObject.setName(r.getString("name"));
            return rowObject;
        };

        return jdbc.query(sql, techMapper);
    }
}
