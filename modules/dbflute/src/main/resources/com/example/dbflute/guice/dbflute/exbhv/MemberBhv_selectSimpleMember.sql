/*
 [df:title]
 Simple Member Select
 
 [df:description]
 This SQL is the most basic example for outsideSql.
 It uses CustomizeEntity and ParameterBean.
*/
-- #df:entity#

-- !df:pmb!
-- !!Integer memberId!!
-- !!String memberName:likePrefix!!
-- !!Date birthdate!!

select member.MEMBER_ID
     , member.MEMBER_NAME
     , member.BIRTHDATE
     , memberStatus.MEMBER_STATUS_NAME
  from MEMBER member
    left outer join MEMBER_STATUS memberStatus
      on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   member.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberName != null*/
   and member.MEMBER_NAME like /*pmb.memberName*/'S%'
   /*END*/
   /*IF pmb.birthdate != null*/
   and member.BIRTHDATE = /*pmb.birthdate*/'1966-09-15'
   /*END*/
 /*END*/
 order by member.BIRTHDATE desc, member.MEMBER_ID asc
