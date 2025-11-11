package hello.hello_spring.repository;

import java.util.List;
import java.util.Optional;

import hello.hello_spring.domain.Member;

public class MemoryMemberRepository implements MemberRepository {

    @Override
    public List<Member> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Member save(Member member) {
        // TODO Auto-generated method stub
        return null;
    }
    
}