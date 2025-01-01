package me.choiyongrae.springbootdeveloper;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
