/*
 [df:title]
 The example for select using options
 
 [df:description]
 This SQL is an example for various options of parameter.
 Point:
   o The option of like search (like, likePrefix, likeContain, likeSuffix)
   o The option of from-to search (fromDate, toDate)
   o The option of classifications for ParameterBean (ref(...) or cls(...))
   o The auto option of classifications for CustomizeEntity 
   o The option of reference to table columns (ref(...))
   o How to set several options (...|...)
*/
-- #df:entity#

-- !df:pmb!
-- !!Integer memberId!!
-- !!String memberName:likePrefix!!
-- !!String memberAccount:like!!
-- !!Date fromFormalizedDate:fromDate!!
-- !!Date toFormalizedDate:toDate!!
-- !!Timestamp fromFormalizedMonth:fromDate(option)!!
-- !!Timestamp toFormalizedMonth:toDate(option)!!
-- !!String memberStatusCode:ref(MEMBER)!! // reference option (including classification)
-- !!Integer displayOrder:ref(MEMBER_STATUS)!!
-- !!Date birthdate:fromDate|ref(MEMBER.BIRTHDATE)!! // several options
-- !!String status:cls(MemberStatus)!! // direct classification setting
-- !!String statusFormalized:cls(MemberStatus.Formalized)!! // fixed classification setting
-- !!List<$$CDef$$.MemberStatus> statusList:ref(MEMBER.MEMBER_STATUS_CODE)!! // classification to list
-- !!List<String> statusFixedList:cls(MemberStatus.Formalized, Withdrawal)!! // fixed classification list
-- !!Integer paymentCompleteFlg:cls(Flg)!! // direct one as Integer
-- !!Integer paymentCompleteTrue:cls(Flg.True)!! // fixed one as Integer

select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , mb.BIRTHDATE -- // select column comment here (no as)
     , mb.FORMALIZED_DATETIME as FORMALIZED_DATETIME -- // select column comment here (using as)
     , mb.MEMBER_STATUS_CODE -- for Classification Test of Sql2Entity
     , stat.MEMBER_STATUS_NAME -- // *select column required test
     , stat.DISPLAY_ORDER as STATUS_DISPLAY_ORDER -- for Alias Name Test
     , 0 as DUMMY_FLG -- // for Classification Test of Sql2Entity
     , 0 as DUMMY_NOFLG -- // for Classification Test of Sql2Entity
  from MEMBER mb
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   mb.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberName != null*/
   and mb.MEMBER_NAME like /*pmb.memberName*/'S%'
   /*END*/
   /*IF pmb.memberAccount != null*/
   and mb.MEMBER_ACCOUNT like /*pmb.memberAccount*/'%v%'
   /*END*/
   /*IF pmb.fromFormalizedDate != null*/
   and mb.FORMALIZED_DATETIME >= /*pmb.fromFormalizedDate*/'1964-12-27'
   /*END*/
   /*IF pmb.toFormalizedDate != null*/
   and mb.FORMALIZED_DATETIME < /*pmb.toFormalizedDate*/'1974-04-17'
   /*END*/
   /*IF pmb.fromFormalizedMonth != null*/
   and mb.FORMALIZED_DATETIME >= /*pmb.fromFormalizedMonth*/'1964-12-01'
   /*END*/
   /*IF pmb.toFormalizedMonth != null*/
   and mb.FORMALIZED_DATETIME < /*pmb.toFormalizedMonth*/'1974-04-01'
   /*END*/
   /*IF pmb.memberStatusCode != null*/
   and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'WDL'
   /*END*/
 /*END*/
 order by mb.MEMBER_ID asc
