package com.kgh.membership.application;

import com.kgh.membership.application.dto.MembershipCardDTO;
import com.kgh.membership.domain.model.membership.card.MembershipCard;
import com.kgh.membership.domain.model.membership.card.MembershipCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MembershipCardService {
    private final MembershipCardRepository membershipCardRepository;

    public MembershipCardDTO.MembershipCardResponse create(MembershipCardDTO.CreateMembershipCard createMembershipCard){
        MembershipCard membershipCard = MembershipCardDTO.CreateMembershipCard.toEntity(createMembershipCard);
        MembershipCard saved = membershipCardRepository.save(membershipCard);
        return MembershipCardDTO.MembershipCardResponse.from(saved);
    }

    public MembershipCardDTO.MembershipCardResponse findByMembershipCardId(Long membershipCardId){
        MembershipCard membershipCard = membershipCardRepository.findById(membershipCardId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 멤버십 카드 아이디입니다."));
        return MembershipCardDTO.MembershipCardResponse.from(membershipCard);
    }
    public List<MembershipCardDTO.MembershipCardResponse> findAll(){
        List<MembershipCard> membershipCards = membershipCardRepository.findAll();
        return MembershipCardDTO.MembershipCardResponse.listForm(membershipCards);
    }
    public void delete(Long membershipCardId){
        MembershipCard membershipCard = membershipCardRepository.findById(membershipCardId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 멤버십 카드 아이디 입니다."));
        if(membershipCard.isMembershipCardIdNotEqual(membershipCardId)){
            throw new IllegalArgumentException("멤버십 카드 아이디가 일치하지 않습니다. membershipCardId =" + membershipCardId);
        }
        membershipCardRepository.deleteById(membershipCardId);
    }
}
