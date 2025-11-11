package hello.hello_spring.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import hello.hello_spring.domain.Member;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    

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